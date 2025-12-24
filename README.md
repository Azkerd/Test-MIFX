# MIFX QA Automation

Automated test suite for MIFX trading platform using **Katalon Studio**.

## ✅ Test Cases

| ID   | Description                                      |
|------|--------------------------------------------------|
| TC01 | Login to MIFX client area                        |
| TC02 | BUY Gold – order 0.01 lot (market order)         |
| TC03 | SELL Gold – order 0.01 lot (market order)        |
| TC04 | BUY Gold – order 0.01 lot with entry price       |
| TC05 | SELL Gold – order 0.01 lot with entry price      |

## ▶️ How to Run

1. **Install Katalon Studio**  
   Download from: [https://www.katalon.com/download/](https://www.katalon.com/download/)

2. **Open Project**  
   Launch Katalon Studio → Open existing project → Select this folder

3. **Run Test Cases**  
   - Go to `Test Cases/` folder
   - Right-click any test case (e.g., `TC04`)
   - Select **Run**

> 💡 Ensure Chrome is installed and up-to-date.

## 🛠 Tech Stack
- **Automation Tool**: Katalon Studio
- **Browser Driver**: ChromeDriver (auto-managed via Katalon)
- **Language**: Groovy (for test scripts)
- **Target Platform**: [MIFX Client Area](https://mifx.com/clientarea/trade-now)
