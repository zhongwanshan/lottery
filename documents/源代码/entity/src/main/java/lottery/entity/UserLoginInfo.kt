package lottery.entity

import javax.persistence.*

/**
 * 用户登录信息
 */
@Entity
@Table(name="user_login_info")
open class UserLoginInfo(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id:Long=0,
    var userId:Long=0,
    var loginTime:Long=0,
    var loginIp:String=""
)
