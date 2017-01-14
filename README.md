# QUESTIONNAIRE

#####

## Setup

Clone this repository:
```
$ git clone https://ikuchkoDAS@bitbucket.org/ikuchkoDAS/questionnairetest.git
```

Restore mySQL database from dump file in the root of the project:
```
$ cd questionnaireTest
$ mysql -u <username> -p <passwd> questionnaire < questionnaire.sql;
```

Build and run application using GRADLE:
```
$ gradle build
& gradle bootRun
```

## Create DB for tests:

Execute stored procedure
```
$ call create_test_DB();
```

## Legal

Copyright (c) 2015 Illia Kuchko

This software is licensed under the MIT license.

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.