package lottery.entity

import javax.persistence.*

@Entity
@Table(name="user")
open class  User(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id:Long=0L,
        //账号名
        var username:String="",
        //密码
        var password:String="",
        //用户角色
        var role:String="",
        //用户名称
        var fullName:String="",
        //身份证号
        var idCard:String="",
        //创建时间
        var createTime:Long=0,
        //用户手机号码
        var phone:String=""
)