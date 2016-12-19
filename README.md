#### ***文中链接各位根据自己项目对应修改***
--------------------------------------------------------------------------------
#macaca (java)
##资源
[社区](https://testerhome.com/wiki/macaca)
[官网](https://macacajs.com/zh/cli-usage0)
[环境搭建](https://testerhome.com/topics/6431)
##步骤 
a）进入工程目录
$cd path/to/macaca-test-sample-java
2）启动Macaca server
3)新建cmd窗口，进入当前工程目录下：

$mvn -s settings.xml clean install
注：mvn -s的作用在于使maven以工程目录下的settings.xml文件为依据下载依赖，但是实践中发现部分同学会出现mvn -s无法生效的作用，这样会导致依赖下载失败，这种情况下，需要大家将工程目录下的settings.xml中的配置相应的添加到本地settings中。

$mvn test

启动server :

//--verbose为可选参数，用于查看详细日志，可不加
$macaca server --verbose
查看当前设备ID:

Android:

$adb devices
iOS:

$xcrun simctl list
查看视图Dom树

//***部分为要监控的设备id
$ app-inspector -u *** 
前提是要安装了app-inspector ,安装命令：

tnpm i app-inspector -g 


测试用例:https://github.com/Yinxl/bootstrap