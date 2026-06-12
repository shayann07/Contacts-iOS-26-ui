# Contacts iOS 26 UI

Kotlin Android contacts-list prototype styled after a modern iOS Contacts interface.

## Overview

This project recreates the visual structure of a contacts screen on Android using XML layouts, Material components, and a RecyclerView. Users can open an expanded bottom sheet, enter a first name, last name, and phone number, and save the contact to a JSON list in SharedPreferences.

Contacts are sorted alphabetically and displayed with an initial avatar, type label, and optional image support in the adapter. Tapping a row shows the contact name and phone number in a toast. Much of the surrounding iOS-inspired interface is currently visual-only.

## Implemented Features

- iOS-inspired contacts screen and bottom navigation styling
- RecyclerView contact list
- Alphabetical sorting by first and last name
- Expanded Material bottom sheet for new contacts
- Required-field checks for first name, last name, and phone number
- SharedPreferences persistence using Gson JSON serialization
- Initial-based avatars when no image URI is present
- Optional adapter support for image URIs through Glide
- Empty-list notification
- Contact detail toast on row tap

## Tech Stack

- Kotlin
- Android SDK and XML layouts
- AndroidX AppCompat and RecyclerView
- Material Components and `BottomSheetDialogFragment`
- ConstraintLayout
- SharedPreferences
- Gson
- Glide

## Data Flow

`MainActivity` loads the saved contact list from SharedPreferences, sorts it, and passes it to `ContactAdapter`. `NewContactFragment` adds a `Contact` to the shared in-memory list. The activity callback re-sorts the list, refreshes the adapter, and serializes the full list back to SharedPreferences.

## Project Structure

```text
app/src/main/
|-- java/com/nayab/contactmnager/
|   |-- MainActivity.kt          # List setup, sorting, and add flow
|   |-- NewContactFragment.kt    # New-contact bottom sheet
|   |-- ContactAdapter.kt        # Row rendering and detail toast
|   |-- ContactData.kt           # SharedPreferences JSON storage
|   |-- BaseContact.kt           # Shared contact behavior
|   |-- Contact.kt               # Regular contact model
|   `-- FavouriteContact.kt      # Favorite model scaffold
|-- res/layout/                  # Main, row, and bottom-sheet layouts
|-- res/drawable/                # iOS-inspired icons and backgrounds
`-- AndroidManifest.xml
```

## Getting Started

### Prerequisites

- Android Studio with a JDK compatible with Android Gradle Plugin 8.11.0
- Android SDK 35
- An Android 7.0 (API 24) or newer device or emulator

### Build

```bash
git clone https://github.com/shayann07/Contacts-iOS-26-ui.git
cd Contacts-iOS-26-ui
./gradlew assembleDebug
```

On Windows PowerShell, use `./gradlew.bat assembleDebug`.

## Current Status and Limitations

- Search UI is present but has no filtering logic.
- Contacts cannot be edited, deleted, called, imported from the system, or synchronized.
- Favorite-contact rendering exists in the adapter, but there is no favorite toggle or persistence flow for `FavoriteContact` objects.
- The Add Photo control and profile-photo workflow are not connected.
- Calls, Contacts, and Keypad bottom navigation items do not navigate.
- Additional fields shown in the new-contact sheet are static labels rather than editable or saved data.
- Contacts are stored as plain JSON in SharedPreferences, not Room or SQLite.
- The bottom-sheet fragment uses a constructor callback, which is not safe for Android fragment recreation.
- Machine-specific `local.properties` and Gradle cache files are tracked.
- Only generated example tests are present.
- No license file is included.
