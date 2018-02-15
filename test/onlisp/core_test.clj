(ns onlisp.core-test
  (:require [clojure.test :refer :all]
            [onlisp.core :refer :all]))

(deftest test-lexical-scope
  (let [y 5]
    (is (= (scope-test 3) [3 7]))))
