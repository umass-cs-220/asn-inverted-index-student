# Inverted Indexer Rubric

## Overview

Each criteria for the assignment will be either objective or
subjective. The objective criteria will be based on facts about the
assignment that are identifiable in the submission and can be given a
score by observation. The subjective criteria are based on the
grader's understanding of the submission and the score is determined
by the reviewer alone.

A `feedback.md` file will be provided in the student's git repository
folder. No comment is required if the student achieves a perfect score
on any of the criteria below. A comment will be put inside the
`feedback.md` file if a perfect score is not achieved. The comment
will consists of a copy of the text for the criteria and a brief
explanation of why the points were lost. The final score will be
placed in the `feedback.md` file at the top:

```
Score: X
```

Where `X` is replaced with the student's score.

**The assignment has a total of 200 points.**

The point break down is as follows:

* Structure and Compilation (25 points)
* Indentation, Formatting, and Style (35 points)
* Code Organization and Access (15 points)
* Design and Implementation (110 points)
* Version Control (15 points)

## Structure and Compilation (25 points)

**O1 (15 points):** Does the submission compile with the `sbt compile`
command. If it does the submission receives full points. If it does
not the submission receives no points. If the problem is simple then
it should be corrected by the reviewer and graded according to the
rest of the rubric. If the problem is complicated or unclear the
submission receives a 0.

**O2 (10 points):** Does the submission contain a `src/main/scala`
directory. If it does then the submission receives full points. If it
does not then the submission receives no points.

## Indentation, Formatting, and Style (35 points)

**O3 (20 points):** Does the submission include documentation in each
of the following files:

* `src/main/scala/FetchActor.scala`
* `src/main/scala/IndexActor.scala`
* `src/main/scala/LinkQueueActor.scala`
* `src/main/scala/ParseActor.scala`
* `src/main/scala/ParseQueueActor.scala`

Dcoumentation should be both scaladoc comments at the beginning of
methods **provided by the student** as well as clarification comments
associated with code. The following scale can be used to award points:

* 20 points if their was sufficient documentation.
* 15 points if documentation existed but missing in certain cases.
* 10 points if several classes, methods, code, etc. were not documented.
* 5 points if there was minimal documentation provided.
* 0 points if there was no documentation.

**O4 (15 points):** Does the submission adher to proper Scala
indentation? In particular, is the code clear and easy to read or is
it difficult to understand the flow of the program because indentation
was off and/or inconsistent? The following scale can be used to award
points:

* 15 points if indentation was followed and consistent.
* 10 points if indentation was followed most of the time.
* 5 points if indentation was followed in a few cases.
* 0 points if indentation was inconsistent and poor.

## Code Organization and Access (15 points)

**S1 (10 points):** Did the submission demonstrate code organization?
In particular, did the submission show signs of reducing code
duplication through factoring common code into functions, classes,
methods, etc? Did the submission organize code into functions,
classes, methods, etc to enhance code readability? The following scale
can be used to award points:

* 10 points if there were clear signs of code organization.
* 7 points if there was a fair amount of code organization, however,
  some methods/functions were lengthy.
* 4 points if code was mostly disorganized.
* 1 points if the submission showed little organization leading to
  code that was difficult to read and/or comprehend.

**S2 (5 points):** Did the submission properly use access modifiers on
classes, objects, methods, functions, and variables that were used to
internal implementation? The following scale can be used to award
points:

* 5 points if the submission demonstrated proper access to classes,
objects, methods, functions, and variables.
* 3 points if some classes, objects, methods, functions, and variables
were kept private/protected/packaged.
* 1 points if the submission did not adequately provide protection of
internal implementation.

## Design and Implementation (100 points)

**O5 (17 points):** Did the submission correctly implement each of the
required sending and receiving of messages in the `FetchActor` class?

* 17 points if the implementation correctly as compared to the
  solution. Note, that the student had some freedom in implementation
  so be aware that their implementation may not completely match the
  solution.
* 12 points if the implementation appears to be missing important
  aspects of the solution.
* 6 points if the implementation is lacking and does not handle the
  receiving and sending of messages properly.
* 0 points if there is no implementation.

**O6 (17 points):** Did the submission correctly implement each of the
required sending and receiving of messages in the `LinkQueueActor`
class?

* 17 points if the implementation correctly as compared to the
  solution. Note, that the student had some freedom in implementation
  so be aware that their implementation may not completely match the
  solution.
* 12 points if the implementation appears to be missing important
  aspects of the solution.
* 6 points if the implementation is lacking and does not handle the
  receiving and sending of messages properly
* 0 points if there is no implementation.

**O7 (17 points):** Did the submission correctly implement each of the
required sending and receiving of messages in the `ParseQueueActor`
class?

* 17 points if the implementation correctly as compared to the
  solution. Note, that the student had some freedom in implementation
  so be aware that their implementation may not completely match the
  solution.
* 12 points if the implementation appears to be missing important
  aspects of the solution.
* 6 points if the implementation is lacking and does not handle the
  receiving and sending of messages properly.
* 0 points if there is no implementation.

**O8 (17 points):** Did the submission correctly implement each of the
required sending and receiving of messages in the `ParseActor` class?

* 17 points if the implementation correctly as compared to the
  solution. Note, that the student had some freedom in implementation
  so be aware that their implementation may not completely match the
  solution.
* 12 points if the implementation appears to be missing important
  aspects of the solution.
* 6 points if the implementation is lacking and does not handle the
  receiving and sending of messages properly.
* 0 points if there is no implementation.

**O9 (17 points):** Did the submission correctly implement each of the
required sending and receiving of messages in the `IndexActor` class?

* 17 points if the implementation correctly as compared to the
  solution. Note, that the student had some freedom in implementation
  so be aware that their implementation may not completely match the
  solution.
* 12 points if the implementation appears to be missing important
  aspects of the solution.
* 6 points if the implementation is lacking and does not handle the
  receiving and sending of messages properly.
* 0 points if there is no implementation.

**O10 (10 points):** Does the submission run using the following
command:

```bash
$ sbt 'run-main cs220.Indexer "http://umass-cs-220.github.io"'
```

* 10 points if it runs without an error and terminates.
* 5 points if it runs but never terminates.
* 1 point if it runs but throws an exception or crashes in some way.

**O11 (5 points):** Does the submission run using the following
command: 

```bash
$ sbt 'run-main cs220.Searcher'
```

* 5 points if the program runs and produces an output of words.
* 2 points if the program runs but does not produce any output.
* 0 points if the program throws an exception.

**O12 (5 points):** Does the submission run using the following
command: 

```bash
$ sbt 'run-main cs220.Searcher WORD'
```

Where you replace the above `WORD` with a word produced in the output
of words above.

* 5 points if the program runs and produces an output of URLs.
* 2 points if the program runs but does not produce any output (try
  other words if necessary).
* 0 points if the program throws an exception.

**O13 (5 points):** Does the submission produce a database that
contains data? Use the `tools/h2cli` program to view the contents of
the database.

* 5 points if the database contains words, documents, and index rows.
* 3 points if the database contains documents or words or index rows.
* 2 point if there is very little data.
* 0 points if there is no change to the database.


## Version Control (20 points)

**O14 (15 points):** Did the submission provide at least 10 `git`
commits? If there was only a single commit make a note in the
feedback file for the student to contact course staff to determine
if it was a git issue.
