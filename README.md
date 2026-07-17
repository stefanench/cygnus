# Local PDF Search Engine

A lightweight desktop-style search engine for PDF collections.

The application scans PDF documents, extracts text, builds an in-memory index and allows searching without an Internet connection.

---

## Demonstration

```
Scanning PDF Library...

Indexed:

manual.pdf
java-guide.pdf
linux-notes.pdf

Search query:

docker

Results

linux-notes.pdf

Matches found: 1
```

---

## Modules

| Module | Description |
|--------|-------------|
| PdfScanner | Reads PDF files |
| TextIndexer | Builds search index |
| SearchEngine | Performs searches |
| ConsoleReport | Displays results |
| SampleLibrary | Demo documents |

---

## Start

```bash
mvn compile
mvn exec:java
```

This demo uses sample documents stored in memory.
