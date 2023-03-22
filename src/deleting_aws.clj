(ns deleting-aws)


;;(def part-nucket {:name "s3://nu-keysets-br-staging"})


(def user-map {:fname "s3://nu-keysets-br-staging"})

(def map-map {:part-nucket "certificates/pri/services/isa-dummy-2/metadata.json"
              })
(def name
  (str (:fname user-map) (:part-nucket map-map)))


(println name)

