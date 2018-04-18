# ShiDao
采用SpringBoot 方便快速部署
工程可打包为jar包 直接通过 java -jar 启动（spring boot 内嵌tomcat）
或者在pom中修改 打包方式为 war 打包后在容器中部署
采用mybatis作为持久层框架
logback作为日志输出

工程包
controller 控制层
与前台进行交互，目前通过restful ：json方式进行交互
service 服务层
连接 controller 和dao层，尽量把业务逻辑写在这层，按理应该在biz来写业务的，暂时就都写在这吧
biz 业务层
用来写业务逻辑的，嫌麻烦的话都写在service里也行
dao 数据层
数据库访问的，用mybatis 自动生成的
model 数据模型
VO 这层 是为了和前台或者移动端交互的 目前对象属性是和model里的对象一致的，例如 UserVo 和User 其实代码一样。主要是为了解决 以后可能 与前台交互对象和 数据库对象 属性不一致或者 有可能long值 在html中显示不全的问题，如果有这个问题 要在vo里把 long的属性 改成string 返给用户。 两个对象 用BeanUtils。copyProperites方法转换就行