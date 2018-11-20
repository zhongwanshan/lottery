package lottery.service.impl

import lottery.SysUserInit
import lottery.UserRole
import lottery.common.bean.Resp
import lottery.common.utils.Beans
import lottery.common.utils.Password
import lottery.entity.User
import lottery.entity.UserLoginInfo
import lottery.service.form.UserForm
import lottery.service.repository.UserLoginInfoRepository
import lottery.service.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import javax.annotation.PostConstruct


interface UserService{
    //用户登录
    fun login(form:UserForm): Resp

    //用户注册
    fun register(form:UserForm):Resp

    //数据初始化
    fun sysUserInit():Resp
}

@Service
open class  UserServiceImpl :UserService{
    @PostConstruct
    override fun sysUserInit(): Resp {
        userRepository.findByRole(UserRole.Admin.v).apply {
            if (this.size==0){
                val user=User(username = SysUserInit.UserName.v,
                        role = UserRole.Admin.v,
                        fullName = UserRole.Admin.mean,
                        password = Password.encrypt(SysUserInit.Password.v),
                        phone = SysUserInit.Phone.v,
                        createTime = System.currentTimeMillis())
                userRepository.save(user)
            }
        }
        return Resp.succ()
    }

    @Autowired private lateinit var userRepository:UserRepository
    @Autowired private lateinit var userLoginInfo:UserLoginInfoRepository

   override fun login(form:UserForm): Resp {
        val ret: User? = userRepository.findByUsername(form.username) ?: return Resp.fail("该用户名不存在")
        val password=Password.encrypt(form.password)
       if (ret!!.password==password){
            val info= UserLoginInfo(
                    userId = ret.id,
                    loginTime = System.currentTimeMillis(),
                    loginIp =form.ip
            )
            userLoginInfo.save(info)
            return Resp.succ("用户登录成功",data=ret)
        }else{
            Resp.fail("密码不正确")
        }
        return  Resp.succ()
    }

    override fun register(form: UserForm): Resp {
        userRepository.findByUsername(form.username).apply {
            if(this!=null){
                Resp.fail("该用户已经存在")
            }
        }
        var user= Beans.copy(form,User::class)
        user.createTime=System.currentTimeMillis()
        user.password=Password.encrypt(form.password)
        user=userRepository.save(user)
        return Resp.succ("用户注册成功",data=user)
    }


}