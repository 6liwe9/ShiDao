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
定义了数据对象