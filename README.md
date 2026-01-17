# CS6650 Building Scalable Distributed System
## Lecture1 (Jan. 9th 2026)
### What is scalability
```
The ability to handle changing demands by adjusting system capacity while maintaing consistent service quality. (e.g. latency)

Look up: Service Level Agreement (SLA)?
```
### Basic design principles
*Aim is to scale in terms of some apllication dimension. Such as the number of requests at a given time.*
- Replication: increase the number of server
- Use resources more efficiently
### Monolithic vs Distributed
```
Monolithic: everything runs on a single machine. Communications happen using function calls.

Distributed: services get distributed on different machines, and they communicate through network. (Should expect traffic problems)
```
## Lecture2 (Jan. 16 2026)
### Concurrency
```
Think about the instruction pipeline. Your goal is to make full use of the computation resources; that is no idling at all!

Suppose there are four steps in a pipeline, and each step is handled by one specific machine.

    Step1
    -------->
            Step2
            -------->
                    Step3
                    -------->
                            Step4
                            --------> 
--------------------------------------------> time/second
```
### Threads in Java
```java
// threads that calls join() on other thread will be blocked

// Main 
public TestMain{
    public void static main(String[] args){
        Thread thread1= new SomeClass();
        thread1.join(); // this will block the main thread until thread1 finish.
    }
}


// thread1
SomeClass implements Runnable{
    @Override
    public void run(){
        // some codes
    }
} 
```