Struts2的类型转换器

我们需要把表单数据转换为响应类对象属性的数据类型，所以我们需要类型转化器，将http请求中传递的string类型的参数进行转化。
默认struts2有内置的类型转化器，可以满足开发中的大部分需求，今天需要学习的是自定义类型的转换器。

项目需求：用户在页面的表单上输入信息来创建人员信息并在页面上显示出来，例如我们输入123，tang,new Person的时候，123就会自动复制给id属性，tang就会自动赋值给name属性。

有以下几个步骤来实现项目功能：

1.编写Person类，有id,name两个属性，并设置相应的get,set方法。

2.创建action类，这里叫ConvertAction，继承ActionSupport类，这样就可以return SUCCESS之类的常量了，此类里面引入private Person person属性，并设置相应的get,set方法,然后默认执行execute()函数。

3.编写自定义转换器类，这里是PersonConverter,需要继承接口StrutsTypeConverter,必须实现convertFromString, convertToString这两个函数。

4.注册自定义转换器，在src目录中建立ConvertAction-conversion.properties文件,写入person=PersonConverter

5.然后配置struts.xml文件

6.新建相关页面，index.jsp用来表单提交，success.jsp用于显示转换后的信息,显示的信息用struts标签打印出来即可。
