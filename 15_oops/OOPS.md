# oops
## polymorphism
- one name ,multiple tasks 
## encapsulation 
- restricting data access 
- use getter setter method 

## access ability 
| Modifier | Class | Package | Subclass | World |
|----------|:-----:|:-------:|:--------:|:-----:|
| `public` | ✅ | ✅ | ✅ | ✅ |
| `protected` | ✅ | ✅ | ✅ | ❌ |
| `no modifier*` | ✅ | ✅ | ❌ | ❌ |
| `private` | ✅ | ❌ | ❌ | ❌ |


## constructors 
- default constructor
```java
Car(){

}
```
- parameterized constructor 
```java
Car(int x){
    x=50;
}