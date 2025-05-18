The choice between `Car myCar = new ElectricCar(...)` and `ElectricCar myCar = new ElectricCar(...)` depends on the use case and the level of abstraction you need:

### 1. **`Car myCar = new ElectricCar(...)`**
- **Use Case**: When you want to work with the object at the level of the `Car` abstraction.
- **Why**: This allows you to treat the `ElectricCar` as a generic `Car`, focusing only on the common functionality defined in the `Car` class.
- **When to Use**:
    - When you are working with polymorphism (e.g., dynamic method dispatch).
    - When you want to write code that works with any type of `Car` (e.g., `ElectricCar`, `GasCar`, etc.).
    - When you don't need to access methods or properties specific to `ElectricCar`.

**Example**:
   ```java
   Car myCar = new ElectricCar("Tesla", "Model S", "Red", 2023, 150, 100, 300);
   myCar.displayCarDetails(); // Calls the overridden method in ElectricCar
   ```

### 2. **`ElectricCar myCar = new ElectricCar(...)`**
- **Use Case**: When you need to access functionality specific to the `ElectricCar` class.
- **Why**: This gives you access to all methods and properties of `ElectricCar`, including those not present in the `Car` class.
- **When to Use**:
    - When you need to call methods like `charge()` or access properties like `batteryCapacity` and `range`.
    - When you are certain that the object will always be an `ElectricCar`.

**Example**:
   ```java
   ElectricCar myCar = new ElectricCar("Tesla", "Model S", "Red", 2023, 150, 100, 300);
   myCar.charge(); // Specific to ElectricCar
   ```

### Summary:
- Use `Car myCar = new ElectricCar(...)` for **polymorphism** and when you only need `Car`-level functionality.
- Use `ElectricCar myCar = new ElectricCar(...)` when you need **specific functionality** of the `ElectricCar` class.