# 🔐 Caesar Cipher Encryption and Decryption in Java

This project implements the **Caesar Cipher** — one of the simplest and most well-known encryption techniques — using the Java programming language. It provides functionality to **encrypt** and **decrypt** text messages based on a user-defined shift value. The Caesar Cipher is a **substitution cipher** where each letter in the plaintext is shifted a fixed number of places down or up the alphabet.

---

## 📚 Table of Contents

- [🔍 About the Project](#-about-the-project)
- [⚙️ How It Works](#️-how-it-works)
- [✨ Features](#-features)
- [📦 Requirements](#-requirements)
- [🚀 Getting Started](#-getting-started)
- [💡 Usage](#-usage)
- [🧪 Example Output](#-example-output)
- [📝 Notes](#-notes)
- [📜 License](#-license)

---

## 🔍 About the Project

The Caesar Cipher demonstrates fundamental cryptographic principles and serves as a practical exercise to understand **substitution ciphers**. Despite its simplicity, it teaches basic encryption/decryption and is often the first cipher introduced in classical cryptography studies.

This Java program is written in a beginner-friendly manner and runs in the terminal, accepting user input and printing the result directly.

---

## ⚙️ How It Works

- The **encryption** process shifts each alphabet character in the plaintext forward by a fixed number (`shift`) in the alphabet.
- The **decryption** process reverses this by shifting characters backward using the same shift value.
- It only affects **alphabetic characters**, leaving punctuation, digits, and spaces unchanged.
- Supports **both uppercase and lowercase** characters.

**Formula:**
- Encryption: `E(x) = (x + shift) mod 26`
- Decryption: `D(x) = (x - shift + 26) mod 26`

---

## ✨ Features

- 🔐 Simple Caesar Cipher logic
- 🔄 Supports both encryption and decryption
- 🆗 Handles uppercase and lowercase letters
- 🧾 Preserves non-letter characters
- 💻 Console-based user input/output
- 🎓 Easy to understand and extend

---

## 📦 Requirements

- Java JDK (version 8 or above)
- Any text editor or Java IDE (e.g., IntelliJ, Eclipse, VS Code)

---

## 🚀 Getting Started

### 1. Clone or Download

Download this repository or create a new folder named `CaesarCipherJava` and place the `CaesarCipher.java` file inside.

### 2. Compile the Java File

Open a terminal in the project directory and run:

```bash
javac CaesarCipher.java
# project_03-30
