package lottery.common.utils

import org.apache.http.NameValuePair
import org.apache.http.client.entity.UrlEncodedFormEntity
import org.apache.http.client.methods.HttpPost
import org.apache.http.entity.StringEntity
import org.apache.http.impl.client.HttpClients
import org.apache.http.message.BasicNameValuePair
import org.apache.http.util.EntityUtils
import java.util.*

object HttpClient{

     fun doPost( url :String, map:Map<String,String> ,encoding:String) :String{
        var body = ""

        //创建httpclient对象
        val client = HttpClients.createDefault()
        //创建post方式请求对象
        val httpPost =  HttpPost(url)

        //装填参数
        var nvps =  ArrayList<NameValuePair>()
        for((k,v) in map) {
            nvps.add(BasicNameValuePair(k, v))
        }
        //设置参数到请求对象中
        httpPost.entity = UrlEncodedFormEntity(nvps, encoding)

        //设置header信息
        //指定报文头【Content-type】、【User-Agent】
        httpPost.setHeader("Content-type", "application/x-www-form-urlencoded")
        httpPost.setHeader("User-Agent", "Mozilla/4.0 (compatible; MSIE 5.0; Windows NT; DigExt)")

        //执行请求操作，并拿到结果（同步阻塞）
        val response = client.execute(httpPost)
        //获取结果实体
        val entity = response.entity
        if (entity != null) {
            //按指定编码转换结果实体为String类型
            body = EntityUtils.toString(entity, encoding)
        }
        EntityUtils.consume(entity)
        //释放链接
        response.close()
        return body
    }


     fun doXmlPost( url :String, params:String ,encoding:String) :String{
        var body = ""

        //创建httpclient对象
        val client = HttpClients.createDefault()
        //创建post方式请求对象
        val httpPost =  HttpPost(url)


        //设置参数到请求对象中
        httpPost.entity = StringEntity(params, encoding)

        //设置header信息
        //指定报文头【Content-type】、【User-Agent】
        httpPost.setHeader("Content-type", "text/html;charset=$encoding")
        httpPost.setHeader("User-Agent", "Mozilla/4.0 (compatible; MSIE 5.0; Windows NT; DigExt)")

        //执行请求操作，并拿到结果（同步阻塞）
        val response = client.execute(httpPost)
        //获取结果实体
        val entity = response.entity
        if (entity != null) {
            //按指定编码转换结果实体为String类型
            body = EntityUtils.toString(entity, encoding)
        }
        EntityUtils.consume(entity)
        //释放链接
        response.close()
        return body
    }


}