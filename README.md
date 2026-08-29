# Contacts iOS 26 UI

[![Platform](https://img.shields.io/badge/Platform-Android-3DDC84?style=for-the-badge&logo=android&logoColor=white)](https://www.android.com/)
[![Language](https://img.shields.io/badge/Language-Kotlin-7F52FF?style=for-the-badge&logo=kotlin&logoColor=white)](https://kotlinlang.org/)
[![UI Style](https://img.shields.io/badge/UI%20Design-iOS%20Contacts%20Style-007AFF?style=for-the-badge&logo=apple&logoColor=white)](https://developer.apple.com/design/human-interface-guidelines/)
[![Storage](https://img.shields.io/badge/Storage-Local%20JSON%20%2F%20Prefs-4CAF50?style=for-the-badge&logo=sqlite&logoColor=white)](https://developer.android.com/)
[![Image Loading](https://img.shields.io/badge/Images-Glide-00BCD4?style=for-the-badge)](https://github.com/bumptech/glide)
[![Min SDK](https://img.shields.io/badge/Min%20SDK-24-00BCD4?style=for-the-badge)](https://developer.android.com/)
[![Target SDK](https://img.shields.io/badge/Target%20SDK-35%20(Android%2015)-00BCD4?style=for-the-badge)](https://developer.android.com/)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg?style=for-the-badge)](LICENSE)

> An iOS-inspired Android contacts management application featuring custom avatar generation, polymorphic contact models, BottomSheet contact creation, and zero-cloud local persistence.

---

## 📖 Overview

**Contacts iOS 26 UI** brings the clean visual elegance and typography of the iOS contact book to Android devices. Designed for simplicity, speed, and absolute privacy, the app lets users manage personal and professional address books entirely on-device without external accounts, cloud syncing, or invasive contact sync permissions.

The app provides automatic alphabetical sorting by first and last names, initial-based colored avatar generation fallback, profile picture rendering with **Glide**, polymorphic contact hierarchies (distinguishing standard and starred favorite contacts), and an interactive **Material BottomSheetDialogFragment** for rapid contact entry.

### Key Highlights
- **iOS Contact Book Aesthetic**: Clean grouped list presentation with circular initial badges and favorite star accents.
- **Polymorphic Contact Hierarchy**: Object-oriented contact models (`BaseContact`, `Contact`, `FavoriteContact`) supporting custom attributes.
- **Dynamic Avatar Generation**: Automatically renders the contact's initial letter inside a circular badge if no profile photo URI is assigned.
- **100% On-Device Persistence**: JSON serialization powered by Google Gson saved to local device preferences for instant loading.

---

## 🏗️ Architecture & Component Flow

```mermaid
flowchart TD
    subgraph UI_Layer [UI & Interaction Layer]
        MainActivity[MainActivity - Sorted Contact List]
        BottomSheet[NewContactFragment - BottomSheetDialog]
        Adapter[ContactAdapter - RecyclerView.Adapter]
    end

    subgraph Domain_Layer [Polymorphic Contact Models]
        BaseContact[BaseContact Abstract Class]
        StandardContact[Contact - Standard Entry]
        FavContact[FavoriteContact - Starred Entry]
    end

    subgraph Data_Storage [Local Persistence Layer]
        ContactData[ContactData Singleton Manager]
        Gson[Google Gson JSON Serializer]
        Prefs[(Android SharedPreferences\ncontacts_prefs)]
    end

    subgraph Media_Pipeline [Image Rendering Engine]
        Glide[Glide Image Loader]
        InitialGen[Circular Initial Avatar Fallback]
    end

    MainActivity --> Adapter
    MainActivity --> BottomSheet
    BottomSheet -->|Creates Contact| ContactData

    BaseContact <|-- StandardContact
    BaseContact <|-- FavContact

    ContactData --> Gson
    Gson <--> Prefs

    Adapter --> Glide
    Adapter --> InitialGen
    ContactData --> MainActivity
```

---

## ✨ Core Features

### 📇 iOS-Inspired Contact Directory
- Full list of contacts sorted automatically in alphabetical order (`compareBy` first name, then last name).
- Dynamic empty state notification informing users when the directory is empty.

### 🎨 Intelligent Avatar Rendering
- Automatic letter extraction (`getFirstInitial`) rendered in a circular badge.
- Seamless Glide image loading when custom avatar image URIs are present.

### 📋 BottomSheet Contact Creator
- Intuitive slide-up `BottomSheetDialogFragment` with full keyboard auto-focus and input validation for First Name, Last Name, and Phone Number.

### ⭐ Polymorphic Contact Hierarchy
- Object-oriented inheritance architecture supporting `Contact` and `FavoriteContact` with custom display badges and contact type labels.

### 🔒 Privacy-First Local Persistence
- Instantaneous reading and writing of contact records via Gson serialized JSON structures stored in secure local SharedPreferences.

---

## 📱 Key Screens & UI Components

| Screen / Component | Class | Description |
|---|---|---|
| **Main Contact List** | `MainActivity` | Main screen with search/action bar, Add (+) action, and sorted RecyclerView. |
| **New Contact Sheet**| `NewContactFragment` | Expandable BottomSheet dialog for adding new contact details. |
| **List Adapter** | `ContactAdapter` | Binds contact names, types, initials, and profile pictures into iOS-styled list rows. |
| **Data Manager** | `ContactData` | Global singleton managing in-memory cache and SharedPreferences serialization. |
| **Model Classes** | `BaseContact`, `Contact`, `FavouriteContact` | Extensible domain models defining contact behavior and display formats. |

---

## 🛠️ Technical Stack Matrix

| Layer / Concern | Technology / Library | Version / Details |
|---|---|---|
| **Platform** | Android OS | `minSdk 24` (Android 7.0) / `targetSdk 35` (Android 15) / `compileSdk 35` |
| **Language** | [Kotlin](https://kotlinlang.org/) | 1.9+ |
| **UI Components** | AndroidX & Material Components | BottomSheetDialogFragment, RecyclerView, Material CardView |
| **Image Loading** | [Glide](https://github.com/bumptech/glide) | `4.16.0` image loading with KAPT annotation processor |
| **Serialization** | [Google Gson](https://github.com/google/gson) | `2.10.1` JSON object serialization and deserialization |
| **Storage** | Android `SharedPreferences` | Fast, zero-overhead on-device key-value persistence |
| **Build System** | Gradle Kotlin DSL (`build.gradle.kts`) | AGP 8.7+ |

---

## 📂 Project Structure

```text
Contacts-iOS-26-ui/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/nayab/contactmnager/
│   │   │   │   ├── MainActivity.kt                # Contact list screen & sort orchestrator
│   │   │   │   ├── NewContactFragment.kt          # BottomSheet modal for creating contacts
│   │   │   │   ├── ContactAdapter.kt              # RecyclerView adapter with Glide/Initials
│   │   │   │   ├── ContactData.kt                 # SharedPreferences & Gson storage manager
│   │   │   │   ├── BaseContact.kt                 # Abstract base class for contact entities
│   │   │   │   ├── Contact.kt                     # Concrete standard contact class
│   │   │   │   └── FavouriteContact.kt            # Favorite contact subclass
│   │   │   ├── res/
│   │   │   │   ├── layout/
│   │   │   │   │   ├── activity_main.xml          # Main contact directory layout
│   │   │   │   │   ├── fragment_new_contact.xml   # BottomSheet dialog layout
│   │   │   │   │   └── item_contact.xml           # iOS-styled contact row item layout
│   │   │   │   └── values/                        # Colors, styles, themes
│   │   │   └── AndroidManifest.xml
│   ├── build.gradle.kts
│   └── proguard-rules.pro
├── gradle/
│   └── libs.versions.toml
├── build.gradle.kts
├── LICENSE
└── README.md
```

---

## 🚀 Getting Started

### Prerequisites
- **Android Studio** (Ladybug 2024.2+ or Hedgehog+).
- **JDK 17** or **JDK 21**.
- Android device or Emulator running **API 24 (Android 7.0)** or higher.

### Installation & Build

1. **Clone the repository**:
   ```bash
   git clone https://github.com/shayann07/Contacts-iOS-26-ui.git
   cd Contacts-iOS-26-ui
   ```

2. **Open in Android Studio**:
   - Open the directory in Android Studio and allow Gradle to sync dependencies.

3. **Build the Debug APK**:
   ```bash
   ./gradlew assembleDebug
   ```

4. **Install & Run**:
   ```bash
   ./gradlew installDebug
   ```

---

## 📄 License

This project is licensed under the **MIT License** — see the [LICENSE](LICENSE) file for complete details.

```text
Copyright (c) 2026 shayann07
```
