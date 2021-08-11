#!/bin/bash
javadoc -docletpath target/BankingProject-0.0.1-SNAPSHOT-jar-with-dependencies.jar -doclet BankingProject.BankingProject.Doclet "$@"
