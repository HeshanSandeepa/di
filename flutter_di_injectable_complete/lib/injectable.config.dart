// GENERATED CODE - DO NOT MODIFY BY HAND

// **************************************************************************
// InjectableConfigGenerator
// **************************************************************************

// ignore_for_file: no_leading_underscores_for_library_prefixes
import 'package:get_it/get_it.dart' as _i1;
import 'package:injectable/injectable.dart' as _i2;

import '%20data/database.dart' as _i3;
import '%20data/sql_database.dart' as _i4;
import 'repository/auth_repository.dart' as _i5;
import 'services/firbase_auth_repository.dart'
    as _i6; // ignore_for_file: unnecessary_lambdas

// ignore_for_file: lines_longer_than_80_chars
/// initializes the registration of provided dependencies inside of [GetIt]
_i1.GetIt $initGetIt(
  _i1.GetIt get, {
  String? environment,
  _i2.EnvironmentFilter? environmentFilter,
}) {
  final gh = _i2.GetItHelper(
    get,
    environment,
    environmentFilter,
  );
  gh.factory<_i3.Database>(() => _i4.SqlDatabase());
  gh.factory<_i5.AuthRepository>(
      () => _i6.FirebaseAuthRepository(get<_i3.Database>()));
  return get;
}
