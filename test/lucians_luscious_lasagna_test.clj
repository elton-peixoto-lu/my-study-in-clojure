(ns lucians-luscious-lasagna-test
  (:require [clojure.test :refer :all])
  (:require [lucians-luscious-lasagna :refer :all]))


(deftest lucians-luscious-lasagna-test
  (is 40 (lucians-luscious-lasagna/expected-time)))