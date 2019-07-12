#测试JVM
用于理解JVM原理

运行时加上参数-XX:+PrintGCDetails就能看到GC日志。

使用VisualVM图形化工具可以看到JVM和GC的变化情况。

通过修改运行参数设置堆内各区的大小来测试GC情况，例如-Xmx20m -Xms20m -XX:NewRatio=1 -XX:SurvivorRatio=2 -XX:+PrintGCDetails