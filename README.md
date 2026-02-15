# Digital Clock - Java Time Tracker

A Java application developed to simulate a digital clock, managing time increments and formatting using custom logic.

## Project Overview

The core objective of this project is to create a digital clock system that accurately tracks hours, minutes, and seconds. It demonstrates fundamental Object-Oriented Programming (OOP) concepts such as class structure, methods, and internal state management.
1. **Time Logic:** Implements custom logic to handle time increments (e.g., resetting seconds to 0 and incrementing minutes when reaching 60).
2. **Formatting:** Ensures the time is always displayed in a clean `HH:MM:SS` format.
3. **Continuous Execution:** The clock updates automatically in a loop, simulating the real-time passage of seconds with high precision.

The program uses the state of the objects to maintain time consistency and provides a clear visual output of the ticking clock.

## Key Features

* **Time Management:** Handles the transition between seconds, minutes, and hours automatically.
* **Encapsulation:** Uses private attributes and public methods to ensure the clock data is modified safely.
* **Modular Design:** Separate classes are used to handle different parts of the clock logic, making the code easier to read and maintain.
* **User Interface:** Uses a graphical or console-based display to show the time updating in real-time.

## Technologies Used

* **Language:** Java.
* **Standard:** Developed using Java SE standards.
* **External Library:** ACM Java Task Force (`acm.jar`).

## Dependencies

This project requires the **ACM Java Task Force** library (`acm.jar`) to handle the execution and display.

**Note:** You do not need to keep the `.jar` file in the project folder. You can store it anywhere on your computer and point to its location during compilation.

## How to Run (Terminal)

1.  **Compile**:
    ```bash
    javac -cp ".:/path/to/your/acm.jar" ClockProgram.java
    ```
2.  **Run**:
    ```bash
    java -cp ".:/path/to/your/acm.jar" ClockProgram
    ```
*(Note: Replace `/path/to/your/acm.jar` with the actual location on your system. On Windows, use a semicolon `;` instead of a colon `:` in the command).*

## Technical Note (Language)
The internal comments are written in **Catalan**, as it was an academic project for the University of Lleida (UdL) as part of the **Computer Science degree (Programació II, 2024-2025)**. This documentation is provided in English for universal portfolio visibility.

---
**Developed by:** Eric Buenavida Crespo.
