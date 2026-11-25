# Refactoring – TP2 Metodología de Sistemas II

Refactoring del código `Videojuego` de la consigna.

- **Mal olor:** Switch Statements / Repeated Switches (`if` por `getClass()` en `imprimirInfo`)
- **Refactoring:** Replace Conditional Logic with Strategy (+ Move Method y Hide Delegate)

## Estructura
- `src/videojuego/` – código Java corregido
- `uml/` – diagramas de clases antes y después (`.png` + fuente PlantUML `.puml`)

## Ejecutar
```bash
javac -encoding UTF-8 -d out src/videojuego/*.java
java -cp out videojuego.Main
```
