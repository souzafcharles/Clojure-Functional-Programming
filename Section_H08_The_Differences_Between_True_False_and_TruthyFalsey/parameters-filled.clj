(defn parameters-filled [name age]
  (if (and name age)
    (println "Parameters filled")
    (println "Parameters not filled")))

(parameters-filled "Charles" 35)
(parameters-filled "Charles" nil)
(parameters-filled nil nil)