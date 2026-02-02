# Exceptions: try/catch and custom exceptions

Key ideas

- Exceptions are thrown when something unexpected happens (e.g., `NumberFormatException`).  
- Use `try` / `catch` to handle errors gracefully.  
- `finally` always runs (cleanup).  
- You can create custom exceptions by extending `Exception`.

Example to run

- `Exceptions.java` — demonstrates parsing with custom `MyCustomException` and `finally`.

Tip

Catch specific exceptions where possible; avoid catching `Exception` broadly during learning.