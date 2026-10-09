# Copilot Instructions for Learning Journal

## Project purpose
This repository is a personal learning journal and technical notebook. It should track experiments, notes, exercises, and failure drills across Java, Spring, cloud infrastructure, data pipelines, and related technologies.

## Folder conventions
- `java/` contains Java learning days and exercises.
- Each day folder should contain:
  - `PREDICTIONS.md`: document expectations before code execution.
  - `Main.java`: runnable Java example for the day.
  - `NOTES.md`: post-session recall notes written from memory.
- `spring/`, `docker-k8s/`, `terraform-cicd/`, `kafka/`, `postgres/`, `typescript/`, and `observability/` contain topic-based notes and experiments.
- `flashcards/` stores topic cards or flashcard exports.
- `exams/` stores practice question logs, scores, and missed concepts.
- `break-it/` stores failure drills, symptoms, diagnosis, and fixes.

## Writing expectations
- Keep notes practical and concise.
- Prefer real examples over generic explanations.
- Write before/after learning observations.
- Record failed attempts, root causes, and fixes.
- Update the root `README.md` progress table when a new topic is started or completed.

## Java conventions
- Use package-less classes for the learning-day exercises unless a package is required.
- Keep examples simple and runnable with the Java CLI or Maven.
- Include short comments only where they clarify core ideas.

## GitHub workflow
- Keep commit messages specific to the learning topic or day.
- Do not add unrelated files to a lesson folder.
- Use clear, descriptive names for files and directories.
