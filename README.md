## Creating java classes from proto file using proto-compiler

.\protoc-27.2-win64\bin\protoc.exe --java_out=src\main\java --proto_path=. .\protoc-27.2-win64\envelope.proto

.\protoc-27.2-win64\bin\protoc.exe --plugin=protoc-gen-grpc-java=.\protoc-27.2-win64\protoc-gen-grpc-java-1.9.1-windows-x86_64.exe --grpc-java_out=src\main\java --proto_path=. .\protoc-27.2-win64\envelope.proto
