# ForceAppSettings

An LSPosed module that forces a specified Locale, display mode (dark/light) and launch mode for selected apps.

## Features

- Force a specified Locale for selected apps
- Force dark / light mode for selected apps
- Support follow system / force dark / force light
- Launch app with Aggressive / System Default / Frozen strategy
## Requirements

- Android 12.0+(API 31+)
- LSPosed API 102+
- Rooted device

## Usage

1. Install the module and enable it in LSPosed
2. Select the apps you want to apply settings to
3. Open the module and configure applications
4. Restart the target app (or reboot the device) to apply changes

## Configuration

| Option       | Description                              |
|--------------|------------------------------------------|
| Locale       | The language used by the specified app   |
| Display Mode | Follow system / Force dark / Force light |
| Launch Mode  | The launch mode used by the selected app |

## Notes

- Only applies to selected apps
- Some apps may not fully work due to their own implementation
- Restarting the target app is recommended after changing settings

## Warnings
- The launch mode feature has only been tested on Android 16. It may not work properly on other versions or devices.
- The launch mode feature is dangerous to some extent. Please fully understand it before use. Use at your own risk; the author assumes no responsibility for any issues that may arise.

## License

All Rights Reserved
