# How to run the benchmark?

If you are running the benchmark on a server, use [`tmux`](https://tmux.github.io/) or [`screen`](https://www.gnu.org/software/screen/) so that you will not lose the terminal session if you disconnect from the server.

## Preparation

```bash
./gradlew clean shadowjar
```

## Generating the models

Edit the `trainbenchmark-scripts/GeneratorScripts.groovy` file. The most important settings are.

* The `ec` execution configuration defining the minimum and the maximum heap memory.
* The `minSize` and `maxSize` of the models. Models are generated between these two extremes, with each model twice as large as the previous one.
* The `scenarios` which you'd generate models for.
* The `formats` which you'd like to generate.

If you set the `GeneratorScript`, run the following command.

```bash
./gradlew generate
```

## Running the benchmark

Edit the `trainbenchmark-scripts/BenchmarkScript.groovy` file. The most important settings are:

* The `minSize` and `maxSize` of the models for benchmarking.

```bash
./gradlew benchmark
```

## Plotting the results

Install the required R packages (`scripts/install-R-packages.sh`).

```bash
./gradlew plot
```

## Hosting web page

You can run a web page by issuing the following command.

```bash
./gradlew page
```

## Summary

To run the whole workflow with a single command.

```bash
./gradlew clean shadowjar generate benchmark plot page
```
