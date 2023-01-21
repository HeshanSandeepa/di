import 'package:flutter/material.dart';
import 'package:flutter_di_injectable_complete/%20data/database.dart';
import 'package:flutter_di_injectable_complete/%20data/sql_database.dart';
import 'package:flutter_di_injectable_complete/injectable.dart';
import 'package:flutter_di_injectable_complete/repository/auth_repository.dart';
import 'package:flutter_di_injectable_complete/services/firbase_auth_repository.dart';
import 'package:get_it/get_it.dart';

//final getIt = GetIt.instance;

void main() {
  WidgetsFlutterBinding.ensureInitialized();
  configureDependencies();

  // getIt.registerSingleton<Database>(SqlDatabase());
  // getIt.registerSingleton<AuthRepository>(
  //     FirebaseAuthRepository(getIt<Database>()));
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  _login() {
    // with out get it

    // final fbRepo = FirebaseAuthRepository();
    // fbRepo.signIn('email', 'password').then((value) => debugPrint(value));

    // with GetIt
    getIt<AuthRepository>()
        .signIn('email', 'password')
        .then((value) => debugPrint(value));
  }

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Flutter Demo',
      theme: ThemeData(
        primarySwatch: Colors.blue,
      ),
      home: Scaffold(
        body: const Center(
          child: Text(
            'You have pushed the button this many times:',
          ),
        ),
        floatingActionButton: FloatingActionButton(
          onPressed: _login,
          tooltip: 'Increment',
          child: const Icon(Icons.add),
        ), // This trailing comma makes auto-formatting nicer for build methods.
      ),
    );
  }
}
