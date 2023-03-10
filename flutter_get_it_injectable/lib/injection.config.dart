// GENERATED CODE - DO NOT MODIFY BY HAND

// **************************************************************************
// InjectableConfigGenerator
// **************************************************************************

// ignore_for_file: no_leading_underscores_for_library_prefixes
import 'package:flutter_get_it_injectable/mock_quote_api_provider.dart' as _i3;
import 'package:flutter_get_it_injectable/quote_repository.dart' as _i5;
import 'package:flutter_get_it_injectable/rela_quote_api_provider.dart' as _i4;
import 'package:get_it/get_it.dart' as _i1;
import 'package:injectable/injectable.dart' as _i2;

/// ignore_for_file: unnecessary_lambdas
/// ignore_for_file: lines_longer_than_80_chars
extension GetItInjectableX on _i1.GetIt {
  /// initializes the registration of main-scope dependencies inside of [GetIt]
  _i1.GetIt init({
    String? environment,
    _i2.EnvironmentFilter? environmentFilter,
  }) {
    final gh = _i2.GetItHelper(
      this,
      environment,
      environmentFilter,
    );
    gh.singleton<_i3.QuoteApiProvider>(_i3.MockQuoteApiProvider());
    gh.singleton<_i3.QuoteApiProvider>(
      _i4.RealQuoteApiProvider(),
      instanceName: 'prod',
    );
    gh.factoryParam<_i5.QuoteRepository, dynamic, dynamic>((
      env,
      _,
    ) =>
        _i5.QuoteRepository(
          provider: gh<_i3.QuoteApiProvider>(instanceName: 'prod'),
          env: env,
        ));
    return this;
  }
}
