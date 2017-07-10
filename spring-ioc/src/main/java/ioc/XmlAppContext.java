package ioc;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by liuhang on 2017/3/29.
 * 读取xml文件内容，并创建对象及对象关系
 */
public class XmlAppContext implements BeanFactory {
    private Map<String, Object> beans = new HashMap<>();

    public XmlAppContext() throws JDOMException, IOException, ClassNotFoundException,
            InstantiationException, IllegalAccessException, NoSuchMethodException,
            InvocationTargetException {
        SAXBuilder saxBuilder = new SAXBuilder();
        Document document = saxBuilder.build(XmlAppContext.class.getClassLoader()
                .getResourceAsStream("beans.xml"));
        Element element = document.getRootElement();
        List list = element.getChildren();
        setBeans(list);
    }

    private void setBeans(List list) throws ClassNotFoundException, IllegalAccessException,
            InstantiationException, NoSuchMethodException, InvocationTargetException {
        for (int i = 0; i < list.size(); i++) {
            Element element = (Element) list.get(i);
            String id = element.getAttributeValue("id");
            String aClass = element.getAttributeValue("class");
            Object object = Class.forName(aClass).newInstance();
            beans.put(id, object);
            setProperty(element, object);
        }
    }

    private void setProperty(Element element, Object object) throws NoSuchMethodException,
            InvocationTargetException, IllegalAccessException {
        for (Element property : (List<Element>) element.getChildren("property")) {
            String name = property.getAttributeValue("name");
            String ref = property.getAttributeValue("ref");
            Object objectRef = this.getBean(ref);
            String methodName = "set" + name.substring(0, 1).toUpperCase() + name.substring(1);
            Method method = object.getClass().getMethod(methodName, objectRef.getClass());
            method.invoke(object, objectRef);
        }
    }

    @Override
    public Object getBean(String name) {
        return beans.get(name);
    }
}
