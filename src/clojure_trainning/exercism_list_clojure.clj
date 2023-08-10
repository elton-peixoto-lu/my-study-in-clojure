(ns clojure-trainning.exercism-list-clojure)

"tracks-on-tracks-on-tracks"
(defn new-list []
  "Creates an empty list of languages to practice."
  '())

(defn add-language
  "Adds a language to the list."
  [lang-list lang]
  (conj lang-list lang))

(defn first-language [lang-list]
  (first lang-list))

(defn remove-language [lang-list]
  (rest lang-list))

(defn count-languages   [lang-list]
  "Returns the total number of languages on the list."
  (count lang-list))

(defn learning-list []
  (let [initial-list (conj (conj (new-list) "Clojure") "Lisp")
        list-without-lisp (remove-language initial-list)
        list-with_java_js (-> (add-language list-without-lisp "Java")
                              (add-language "JavaScript"))]
    (count-languages list-with_java_js)))