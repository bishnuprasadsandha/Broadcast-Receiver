# 📡 Android Broadcast Receiver Projects

This repository contains two separate Android applications demonstrating how Broadcast Receivers work in Android.

---

## 📁 Project Structure
Broadcast-Receiver/

├── BroadcastReceivers/ The app that receives broadcast messages

└── BroadcastReceiverSenderApp/ The app that sends broadcast messages


---

## 📱 Projects Overview

### 1. **BroadcastReceivers**
- **Description**: An Android app that listens for and responds to broadcast messages, including system events like boot completed, airplane mode changes, etc.
- **Key Features**:
  - Dynamic and static broadcast receiver registration
  - Logs and UI updates upon receiving broadcasts

### 2. **BroadcastReceiverSenderApp**
- **Description**: A companion Android app designed to **send custom broadcast intents** that `BroadcastReceivers` listens for.
- **Key Features**:
  - Send explicit and implicit broadcasts
  - Designed to test broadcast scenarios with the other app

---

## 🚀 How to Run

1. Clone the repo:
   ```bash
   git clone https://github.com/your-username/Broadcast-Receiver.git
   cd Broadcast-Receiver

## 🛠 Requirements

- Android Studio Hedgehog or later
- Kotlin
- Minimum SDK: 21+

## 📚 Concepts Covered
- BroadcastReceiver (static and dynamic)
- Intent filters
- System vs. custom broadcasts
- Inter-app communication via broadcast
