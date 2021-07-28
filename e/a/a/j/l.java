package e.a.a.j;

import e.a.a.d;
import e.a.a.f;
import e.a.a.k.d;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.ProcessingInstruction;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class l {
  private static final Object a = new Object();
  
  private static DocumentBuilderFactory b = a();
  
  public static f a(Object paramObject, d paramd) {
    e.a(paramObject);
    if (paramd == null)
      paramd = new d(); 
    paramObject = a(b(paramObject, paramd), paramd.g(), new Object[3]);
    if (paramObject != null && paramObject[1] == a) {
      k k = f.c((Node)paramObject[0]);
      k.a((String)paramObject[2]);
      if (!paramd.f())
        o.a(k, paramd); 
      return k;
    } 
    return new k();
  }
  
  private static DocumentBuilderFactory a() {
    DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
    documentBuilderFactory.setNamespaceAware(true);
    documentBuilderFactory.setIgnoringComments(true);
    try {
      documentBuilderFactory.setFeature("http://javax.xml.XMLConstants/feature/secure-processing", true);
      documentBuilderFactory.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);
      documentBuilderFactory.setFeature("http://xml.org/sax/features/external-general-entities", false);
      documentBuilderFactory.setFeature("http://xerces.apache.org/xerces2-j/features.html#disallow-doctype-decl", false);
      documentBuilderFactory.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
      documentBuilderFactory.setFeature("http://xerces.apache.org/xerces2-j/features.html#external-parameter-entities", false);
      documentBuilderFactory.setFeature("http://apache.org/xml/features/nonvalidating/load-external-dtd", false);
      documentBuilderFactory.setXIncludeAware(false);
      documentBuilderFactory.setExpandEntityReferences(false);
      return documentBuilderFactory;
    } catch (Exception exception) {
      return documentBuilderFactory;
    } 
  }
  
  private static Document a(a parama, d paramd) {
    InputSource inputSource = new InputSource(parama.a());
    try {
      boolean bool = paramd.d();
      if (bool)
        try {
          b.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);
        } finally {
          Exception exception;
        }  
      return a(inputSource);
    } catch (d d1) {
      if (d1.a() == 201 || d1.a() == 204) {
        a a1 = parama;
        if (paramd.c())
          a1 = d.a(parama); 
        if (paramd.e())
          try {
            String str = a1.b();
            return a(new InputSource(new b(new InputStreamReader(a1.a(), str))));
          } catch (UnsupportedEncodingException unsupportedEncodingException) {
            throw new d("Unsupported Encoding", 9, d1);
          }  
        return a(new InputSource(a1.a()));
      } 
      throw d1;
    } 
  }
  
  private static Document a(InputStream paramInputStream, d paramd) {
    if (!paramd.c() && !paramd.e())
      return a(new InputSource(paramInputStream)); 
    try {
      return a(new a(paramInputStream), paramd);
    } catch (IOException iOException) {
      throw new d("Error reading the XML-file", 204, iOException);
    } 
  }
  
  private static Document a(String paramString, d paramd) {
    new InputSource(new StringReader(paramString));
    try {
      boolean bool = paramd.d();
      if (bool)
        try {
          b.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);
        } finally {
          Exception exception;
        }  
      return a(new InputSource(new StringReader(paramString)));
    } catch (d d1) {
      if (d1.a() == 201 && paramd.e())
        return a(new InputSource(new b(new StringReader(paramString)))); 
      throw d1;
    } 
  }
  
  private static Document a(InputSource paramInputSource) {
    try {
      DocumentBuilder documentBuilder = b.newDocumentBuilder();
      documentBuilder.setErrorHandler(null);
      return documentBuilder.parse(paramInputSource);
    } catch (SAXException sAXException) {
      throw new d("XML parsing failure", 201, sAXException);
    } catch (ParserConfigurationException parserConfigurationException) {
      throw new d("XML Parser not correctly configured", 0, parserConfigurationException);
    } catch (IOException iOException) {
      throw new d("Error reading the XML-file", 204, iOException);
    } 
  }
  
  private static Object[] a(Node paramNode, boolean paramBoolean, Object[] paramArrayOfObject) {
    NodeList nodeList = paramNode.getChildNodes();
    for (int i = 0; i < nodeList.getLength(); i++) {
      Node node = nodeList.item(i);
      if (7 == node.getNodeType()) {
        ProcessingInstruction processingInstruction = (ProcessingInstruction)node;
        if ("xpacket".equals(processingInstruction.getTarget())) {
          if (paramArrayOfObject != null)
            paramArrayOfObject[2] = processingInstruction.getData(); 
          continue;
        } 
      } 
      if (3 != node.getNodeType() && 7 != node.getNodeType()) {
        String str1 = node.getNamespaceURI();
        String str2 = node.getLocalName();
        if (("xmpmeta".equals(str2) || "xapmeta".equals(str2)) && "adobe:ns:meta/".equals(str1))
          return a(node, false, paramArrayOfObject); 
        if (!paramBoolean && "RDF".equals(str2) && "http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(str1)) {
          if (paramArrayOfObject != null) {
            paramArrayOfObject[0] = node;
            paramArrayOfObject[1] = a;
          } 
          return paramArrayOfObject;
        } 
        Object[] arrayOfObject = a(node, paramBoolean, paramArrayOfObject);
        if (arrayOfObject != null)
          return arrayOfObject; 
      } 
      continue;
    } 
    return null;
  }
  
  private static Document b(Object paramObject, d paramd) {
    return (paramObject instanceof InputStream) ? a((InputStream)paramObject, paramd) : ((paramObject instanceof byte[]) ? a(new a((byte[])paramObject), paramd) : a((String)paramObject, paramd));
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/a/a/j/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */