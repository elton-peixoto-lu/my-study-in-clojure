(ns basic-one-test
  (:require [clojure.test :refer [deftest is]]
            basic-one))

(deftest basic-one-test
  (is (= 7 (basic-one/add 3 4))))
