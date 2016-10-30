# study_jaxb_2_x
1、xjc
	<sources>指定资源文件的路径
	<packageName>指定生成的java代码放在哪个包里面
	<sourceType>指定资源 文件的类型，默认未schema，还可以是DTD  或者其他
	<target>set the JAXB runtime version to 2.1  重点是runtime(运行期)，可惜暂时没有办法尝试
	传说中的Multiple schemas 居然不行！
2、schemagen
	默认会将项目下所有的java类生成相应的schema文件
	配置上schemaSourceExcludeFilters之后，可以设置哪些目录下的类文件不能被转化
	schemaSourceExcludeFilters中的正则表达式： 案例  \\other.*    以\other打头的目录