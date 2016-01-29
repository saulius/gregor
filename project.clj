(defproject gregor "0.1.0-SNAPSHOT"
  :description "See Readme"
  :url "https://github.com/weftio/gregor.git"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/core.async "0.2.374"]
                 [org.apache.kafka/kafka_2.10 "0.9.0.0"]
                 [environ "1.0.1"]
                 [com.taoensso/timbre "4.0.2"]
                 [prismatic/schema "0.4.3"]]
  :main ^:skip-aot gregor.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
