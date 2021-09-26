# Tính chất của hướng đối tượng

## Tính đóng gói (Encapsulation)

<img
    width='100px'
    src='./assets/imgs/62894-package-icon.png'/>

> Là cách để che dấu những tính chất xử lý bên trong của đối tượng, những đối tượng khác không thể tác động trực tiếp làm thay đổi trạng thái  chỉ có thể tác động thông qua các method public của đối tượng đó.

Thể hiện qua:

- Thuộc tính `private`;
- Các phương thức `setter` và `getter`.

## Tính trừu tượng(Abstraction)

<img
    width='100px'
    src='./assets/imgs/c45afb857e72b86e87baaf255f71ff37-geometric-logo-abstract.png'/>

> Là phương pháp trừu tượng hóa định nghĩa lên những hành động, tính chất của loại đối tượng nào đó cần phải có.

Thể hiện qua:

- Phương thức và thuộc tính của đối tượng.

## Tính đa hình (Polymorphism )

<img
    width='200'
    src='./assets/imgs/What-is-Polymorphism.jpg'/>

> Là một đối tượng thuộc các lớp khác nhau có thể hiểu cùng một thông điệp theo cách khác nhau.

Thể hiện qua:

- Một phương thức có thể nhận các tham số khác nhau.

## Tính kế thừa (Inheritance)

> Là kỹ thuật cho phép kế thừa lại những tính năng mà một đối tượng khác đã có, giúp tránh việc code lặp dư thừa mà chỉ xử lý công việc tương tự.

---

## Enum

```java
public enum enumName{
    VALUE1,
    VALUE2,
}
```

---

## Phạm vi truy cập của thuộc tính

```java
private <dataType> <variableName>;
/**
 *  - Trong class
 */
protected <dataType> <variableName>;
/**
 *  - Trong class
 *  - Trong class được thừa kế
 */
public <dataType> <variableName>;
/**
 *  - Truy cập global
 */
[default] <dataType> <variableName>;    // Khong care
```
