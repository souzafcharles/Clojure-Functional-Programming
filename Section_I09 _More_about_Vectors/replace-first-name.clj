(require '[clojure.string :as str])

(defn replace-first-name [names new-first-name]
  (assoc names 0 new-first-name))

(println (str/join " " (replace-first-name ["Carlos" "Fernandes" "de Souza"] "Charles")))
(println (str/join " " (replace-first-name ["Belizario" "Bartholomeu" "de Bigode"] "Balthazar")))
(println (str/join " " (replace-first-name ["Otacilia" "Othilia" "Birrenta"] "Ophelia")))
