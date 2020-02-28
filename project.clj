(defproject eastwood-example "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}

  :dependencies [[org.clojure/clojure "1.10.0"]
                 [com.google.firebase/firebase-admin "6.12.2"
                  :exclusions [io.netty/netty-codec-http2 io.grpc/grpc-core
                               io.grpc/grpc-api io.grpc/grpc-netty-shaded]]]

  :plugins [[jonase/eastwood "0.3.4"]]
  :eastwood {:config-files ["resources/eastwood-config.clj"]}
  :repl-options {:init-ns eastwood-example.core})
