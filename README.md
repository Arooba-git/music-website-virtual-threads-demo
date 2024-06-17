This sample project is a simplified replica of [music-website](https://github.com/Yin-Hongwei/music-website), featuring only the ConsumerController, designed to demonstrate the application's performance using [virtual threads](https://docs.oracle.com/en/java/javase/21/core/virtual-threads.html) 

| Metric      | Original           | Virtual  
|:-----------:|:------------------:|:----------------:|
| **Latency (longest processing time)** | 25.85 |  20.37 |
| **Memory Usage (MB)**| 1040.42     |  630.55 |
| **CPU Usage (%)**    | 10.04 | 10.14 |
| **Throughput (requests/sec)**    | 2565.82 | 2375.13 |
| **Requests Passed (\%)** | 19.86      | 20.57 |
