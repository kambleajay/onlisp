(ns onlisp.core)

(def scope-test
  (let [y 7]
    (fn [x] [x y])))
