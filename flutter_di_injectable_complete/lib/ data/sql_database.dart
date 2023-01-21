import 'package:flutter_di_injectable_complete/%20data/database.dart';
import 'package:injectable/injectable.dart';

@Injectable(as: Database)
class SqlDatabase implements Database {
  @override
  Future<String> verifyUserCredentials(String email, String password) async {
    return 'Credential verified';
  }
}
