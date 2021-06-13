#!/bin/bash
set -ex
clojure -M -m cljs.main -co build.edn --compile

