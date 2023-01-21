import 'package:flutter_di_injectable_complete/repository/auth_repository.dart';
import 'package:injectable/injectable.dart';

import '../ data/database.dart';

@Injectable(as: AuthRepository)
class FirebaseAuthRepository extends AuthRepository {
  final Database _database;

  FirebaseAuthRepository(this._database);

  @override
  Future<String> signIn(String email, String password) async {
    final result = await _database.verifyUserCredentials(email, password);
    return '$result & sign in completed';
  }

  @override
  Future<void> signOut() async {
    print('log out');
  }

  @override
  Future<String> signUp(String email, String password) async {
    return 'sign up completed';
  }
}
