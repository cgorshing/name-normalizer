(defproject name-normalizer "0.1.0-SNAPSHOT"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.10.1"]]
  :main ^:skip-aot name-normalizer.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
