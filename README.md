#测试JVM
用于理解JVM原理

运行时加上参数-XX:+PrintGCDetails就能看到GC日志。

使用JVisualVM图形化工具可以看到JVM和GC的变化情况。

通过修改运行参数设置堆内各区的大小来测试GC情况，例如
```
-Xmx20m -Xms20m -XX:NewRatio=1 -XX:SurvivorRatio=2 -XX:+PrintGCDetails
```

内存溢出时保存堆信息dump文件 
```
-XX:+HeapDumpOnOutOfMemoryError
-XX:HeapDumpPath=e:/heap.hprof
```

用JVisualVM连接远程服务器，推荐用JMX方式，就是在服务器启动springboot时添加启动参数
```
nohup>nohupGps java -Dcom.sun.management.jmxremote=true -Dcom.sun.management.jmxremote.port=端口号 -Dcom.sun.management.jmxremote.authenticate=false -Dcom.sun.management.jmxremote.ssl=false -Djava.rmi.server.hostname=服务器地址 -Dcom.sun.management.jmxremote.rmi.port=端口号 -jar XXX.jar 2>&1 &
```

JVisualVM还可以装入dump文件分析，不过因为dump文件体积巨大不便从服务器拉下来，所以先在服务器用MAT工具生成分析报告再拉到本地。