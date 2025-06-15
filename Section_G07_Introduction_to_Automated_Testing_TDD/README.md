# Setting up a Clojure Project via Docker.
- This guide outlines the steps to download the Clojure application environment via Docker and subsequently create a new Clojure project.

## 1. Launching the Clojure Docker Environment:
- To initiate a Docker container with the Clojure and Leiningen environment, please execute the following command in your terminal:

```bash
docker run --rm -it -v %cd%:/work -w /work/clojure-treinamento clojure:lein-2.9.3 bash
```

## 2. Creating a New Clojure Project.

- Execute the following command to generate a new Clojure application named traning-clojure-codes:

```bash
lein new app traning-clojure-codes
```

## 3. Running Your Clojure Application. 

- Navigate into your newly created project directory if you are not already there:

```bash
cd traning-clojure-codes
```bash

- Then, to execute your Clojure application test (TDD), use the command:

```bash
lein test
```