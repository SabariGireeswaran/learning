# File I/O: reading and writing files

Key ideas

- Use `FileReader` / `FileWriter` or the `Buffered` wrappers for efficiency.  
- Prefer try-with-resources (`try (resource) { ... }`) to ensure streams are closed.  
- Handle `IOException` which can be thrown during I/O operations.

Example to run

- `FileIOExample.java` — writes `sample.txt` and reads it back.

Tip

Check the working directory to find the file created by the program (it will be created where you run the program).