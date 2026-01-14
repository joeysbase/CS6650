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
